package net.biorn.biornmod.init;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class MandarinJuice extends Item {
    public MandarinJuice() {
        super(new Properties().food(new FoodProperties.Builder()
                .nutrition(4).saturationMod(0.2F).build()));
    }

    private static final int DRINK_DURATION = 32;

    @Override
    public ItemStack finishUsingItem(ItemStack juice, Level world, LivingEntity entity) {
        if (!world.isClientSide)
            super.finishUsingItem(juice, world, entity); // FORGE - move up so stack.shrink does not turn stack into air
        if (entity instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, juice);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (juice.isEmpty()) {
            return new ItemStack(ItemInit.EMPTY_GLASS.get());
        } else {
            if (entity instanceof Player && !((Player)entity).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(ItemInit.EMPTY_GLASS.get());
                Player player = (Player)entity;
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }

            return juice;
        }
    }
    @Override
    public int getUseDuration(ItemStack p_42933_) {
        return DRINK_DURATION;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.DRINK;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(world, player, hand);
    }

    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, @org.jetbrains.annotations.Nullable net.minecraft.nbt.CompoundTag nbt) {
        return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
    }
}


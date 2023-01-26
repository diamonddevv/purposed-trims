package net.diamonddev.purposedtrims;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class TrimUtil {

    private static final String TRIM_KEY = "Trim";
    private static final String MATERIAL_KEY = "material";


    public static Identifier getMaterialFromItemStack(ItemStack itemStack) {
        if (itemStack.isIn(ItemTags.TRIMMABLE_ARMOR) && itemStack.getNbt() != null && itemStack.getNbt().contains("Trim")) {
            NbtCompound nbtCompound = itemStack.getSubNbt("Trim");
        }
    }

}

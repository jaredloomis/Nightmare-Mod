package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(Side.CLIENT)
public class NpcMerchant implements IMerchant
{
    private InventoryMerchant field_70937_a;

    /** This merchant's current player customer. */
    private EntityPlayer customer;

    /** The MerchantRecipeList instance. */
    private MerchantRecipeList recipeList;

    public NpcMerchant(EntityPlayer par1EntityPlayer)
    {
        this.customer = par1EntityPlayer;
        this.field_70937_a = new InventoryMerchant(par1EntityPlayer, this);
    }

    public EntityPlayer getCustomer()
    {
        return this.customer;
    }

    public void setCustomer(EntityPlayer par1EntityPlayer) {}

    public MerchantRecipeList getRecipes(EntityPlayer par1EntityPlayer)
    {
        return this.recipeList;
    }

    public void setRecipes(MerchantRecipeList par1MerchantRecipeList)
    {
        this.recipeList = par1MerchantRecipeList;
    }

    public void useRecipe(MerchantRecipe par1MerchantRecipe) {}
}
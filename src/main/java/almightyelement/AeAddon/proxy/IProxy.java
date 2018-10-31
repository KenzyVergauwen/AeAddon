package almightyelement.AeAddon.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public interface IProxy 
{
	 default void preInit(FMLPreInitializationEvent event)
	    {
	    }

	    default void init(FMLInitializationEvent event)
	    {
	    }

	    default void postInit(FMLPostInitializationEvent event)
	    {
	    }

}

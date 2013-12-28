package elliotcm.quartermaster;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class Quartermaster {

	@Instance(ModInfo.ID)
	public static Quartermaster mod;

	private Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = Logger.getLogger(ModInfo.ID);
		logger.setParent(FMLLog.getLogger());
	}

}

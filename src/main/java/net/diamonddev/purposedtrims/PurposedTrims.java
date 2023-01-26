package net.diamonddev.purposedtrims;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.FabricLoaderImpl;
import net.minecraft.SharedConstants;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PurposedTrims implements ModInitializer {


	public static final String MOD_ID = "purposedtrims";
	public static String VERSION = FabricLoaderImpl.INSTANCE.getModContainer(MOD_ID).orElseThrow().getMetadata().getVersion().getFriendlyString();
	public static String MC_VER = SharedConstants.getGameVersion().getName();

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final IdentifierBuilder MC_ID = new IdentifierBuilder("minecraft");
	@Override
	public void onInitialize() {
		long startInitTime = System.currentTimeMillis();
		//


		//
		long initializationTime = System.currentTimeMillis() - startInitTime;
		LOGGER.info("Purposed Trims {" + MOD_ID + " - " + VERSION + "} for Minecraft " + MC_VER + " has initialized (" + initializationTime + " milliseconds elapsed)");
		LOGGER.warn(
				"Note: Purposed Trims is currently only for snapshot versions. " +
						"The mod hopefully should work with snapshots beyond 23w04a, " +
						"but because these are in-development Minecraft versions, " +
						"things could break. This mod is also in a beta stage, as " +
						"yarn mappings for all the new trim related data in-game " +
						"arent written yet. Here be dragons!");
	}


	public static class IdentifierBuilder {
		private final String id;
		public IdentifierBuilder(String id) {
			this.id = id;
		}

		public Identifier build(String path) {
			return new Identifier(id, path);
		}
	}
}

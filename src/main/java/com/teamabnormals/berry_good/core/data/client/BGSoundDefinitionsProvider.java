package com.teamabnormals.berry_good.core.data.client;

import com.teamabnormals.berry_good.core.BerryGood;
import com.teamabnormals.berry_good.core.registry.BGSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class BGSoundDefinitionsProvider extends SoundDefinitionsProvider {

	public BGSoundDefinitionsProvider(DataGenerator gen, ExistingFileHelper fileHelper) {
		super(gen, BerryGood.MOD_ID, fileHelper);
	}

	@Override
	public void registerSounds() {
		this.add(BGSounds.MUSIC_DISC_FOX.get(), definition().with(sound(new ResourceLocation(BerryGood.MOD_ID, "records/fox")).stream()));
	}
}
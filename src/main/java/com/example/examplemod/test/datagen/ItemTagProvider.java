package com.example.examplemod.test.datagen;

import com.example.examplemod.test.tree.TreeTest;
import com.example.examplemod.test.woodwork.WoodworkTest;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ItemTagProvider extends ItemTagsProvider {

    public ItemTagProvider(DataGenerator generator, BlockTagsProvider bp, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, bp, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        WoodworkTest.TEST_AT.register().addItemTags(this);
        WoodworkTest.TEST_MIXIN.register().addItemTags(this::tag);
    }
}

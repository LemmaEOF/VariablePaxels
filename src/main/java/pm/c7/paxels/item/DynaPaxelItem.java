package pm.c7.paxels.item;

import io.github.cottonmc.dynagear.api.ConfiguredMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;


public class DynaPaxelItem extends PaxelItem {
    ConfiguredMaterial material;
    public DynaPaxelItem(ConfiguredMaterial material, Settings settings) {
        super(material.asTool(), settings);
        this.material = material;
    }

    public String getTranslationKey() {
        return "item.dynagear.paxel";
    }

    public Text getName() {
        String mat = this.material.getName().substring(0, 1).toUpperCase() + this.material.getName().substring(1);
        return new TranslatableText(this.getTranslationKey(), new Object[]{mat});
    }

    public Text getName(ItemStack stack) {
        String mat = this.material.getName().substring(0, 1).toUpperCase() + this.material.getName().substring(1);
        return new TranslatableText(this.getTranslationKey(), new Object[]{mat});
    }
}

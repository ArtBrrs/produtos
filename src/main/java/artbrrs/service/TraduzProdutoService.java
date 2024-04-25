package artbrrs.service;

import artbrrs.model.Product;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class TraduzProdutoService {

    public void traduzir(Product product) {
        String name = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getName());
        String description = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getDescription());
        String category = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, product.getCategory());

        product.setName(name);
        product.setDescription(description);
        product.setCategory(category);

    }

}

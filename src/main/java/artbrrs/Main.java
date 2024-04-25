package artbrrs;

import artbrrs.model.Product;
import artbrrs.service.TraduzProdutoService;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Product> products = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv")).
                withType(Product.class).build().parse();

        products.forEach(product -> {
            System.out.println(product);
        });

        TraduzProdutoService traduzProduto = new TraduzProdutoService();

        products.forEach(product -> {
            traduzProduto.traduzir(product);
            System.out.println(product);
        });

    }
}
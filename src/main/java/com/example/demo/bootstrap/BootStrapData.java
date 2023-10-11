package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        InhousePart bridge = new InhousePart(1);
        bridge.setName("Nickel Bridge");
        bridge.setPrice(149.00);
        bridge.setInv(5);

        InhousePart tuner = new InhousePart(2);
        tuner.setName("Nickel Tuners");
        tuner.setPrice(199.00);
        tuner.setInv(5);

        InhousePart pots = new InhousePart(3);
        pots.setName("Audio Taper Pots");
        pots.setPrice(40.00);
        pots.setInv(20);

        InhousePart strings = new InhousePart(4);
        strings.setName("KCG RoundWound Nickel Strings");
        strings.setPrice(19.00);
        strings.setInv(10);

        InhousePart instCase = new InhousePart(5);
        instCase.setName("KCG Hardshell Case");
        instCase.setPrice(199.00);
        instCase.setInv(5);

        OutsourcedPart bkMules = new OutsourcedPart();
        bkMules.setId(10);
        bkMules.setInv(10);
        bkMules.setPrice(349.00);
        bkMules.setName("Bare Knuckle - Mules");
        bkMules.setCompanyName("Bare Knuckle Pickups");

        OutsourcedPart bkRebelYell = new OutsourcedPart();
        bkRebelYell.setId(11);
        bkRebelYell.setInv(10);
        bkRebelYell.setPrice(349.00);
        bkRebelYell.setName("Bare Knuckle - Rebel Yell");
        bkRebelYell.setCompanyName("Bare Knuckle Pickups");

        OutsourcedPart skbCase = new OutsourcedPart();
        skbCase.setId(12);
        skbCase.setInv(10);
        skbCase.setPrice(249.00);
        skbCase.setName("SKB Hardshell Case");
        skbCase.setCompanyName("SKB");

        OutsourcedPart fralin = new OutsourcedPart();
        fralin.setId(13);
        fralin.setInv(10);
        fralin.setPrice(449.99);
        fralin.setName("Lindy Fralin - Classic");
        fralin.setCompanyName("Lindy Fralin Pickups");

        OutsourcedPart drStrings = new OutsourcedPart();
        drStrings.setId(14);
        drStrings.setInv(10);
        drStrings.setPrice(14.99);
        drStrings.setName("DR Pure Blues Strings");
        drStrings.setCompanyName("DR");

        if(partRepository.count() == 0) {
            partRepository.save(bridge);
            partRepository.save(tuner);
            partRepository.save(pots);
            partRepository.save(strings);
            partRepository.save(instCase);
            partRepository.save(bkMules);
            partRepository.save(bkRebelYell);
            partRepository.save(fralin);
            partRepository.save(skbCase);
            partRepository.save(drStrings);

        }




         /*

        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
*/

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        Product sStyle = new Product (100, "S-Style", 1899.00, 10);
        Product tStyle = new Product (101, "T-Style", 1899.00, 10);
        Product scStyle = new Product (102, "Single Cut", 2499.00, 10);
        Product hbStyle = new Product (103, "Hollow body", 3299.00, 10);
        Product acoustic = new Product (104, "Acoustic", 1899.00, 10);


        if(productRepository.count() == 0) {
            productRepository.save(sStyle);
            productRepository.save(tStyle);
            productRepository.save(scStyle);
            productRepository.save(hbStyle);
            productRepository.save(acoustic);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

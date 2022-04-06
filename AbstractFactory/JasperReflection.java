package AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("all")
public class JasperReflection {
    public static void main(String[] args) {
        Class c = null;
        AbstractFactory factory = null;

        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(new FileInputStream(
                    "C:/Users/Sampo B/Documents/Metropolia/otp2/Suunnittelumallit/AbstractFactory/tehdas.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            c = Class.forName(properties.getProperty("factory"));

            factory = (AbstractFactory) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        AdidasFactory af = factory.makeAdidas();
        BossFactory bf = factory.makeBoss();

        Jasper j = new Jasper();

        j.wearOutfit(af);
        j.showYourOutfit();
        System.out.println("\n#####\n");
        j.wearOutfit(bf);
        j.showYourOutfit();
    }
}

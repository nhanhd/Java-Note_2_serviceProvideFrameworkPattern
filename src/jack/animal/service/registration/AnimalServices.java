package jack.animal.service.registration;

import jack.animal.provider.Provider;
import jack.animal.service.AnimalService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnimalServices {

    // Make class non-instaniable
    private AnimalServices() {
    }

    public static final String DEFAULT_PROVIDER_NAME = "ant";

    // Maps service names to services
    public static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    // Provider registration APi
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    // Service access API
    public static AnimalService newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name: " + name);
        }
        return p.createService();
    }

    public static AnimalService newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

}

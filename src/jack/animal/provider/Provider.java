package jack.animal.provider;

import jack.animal.service.AnimalService;

public interface Provider {
    AnimalService createService();
}

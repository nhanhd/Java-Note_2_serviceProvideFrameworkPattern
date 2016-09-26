package jack.animal.provider.elephant;

import jack.animal.service.AnimalService;

public class ElephantService implements AnimalService{

    @Override
    public String getAnimal() {
        return "I'm Elephant :)";
    }
    @Override
    public String walk() {
        return "I walk by 4 legs :)";
    }

}

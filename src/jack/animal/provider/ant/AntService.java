package jack.animal.provider.ant;

import jack.animal.service.AnimalService;

public class AntService implements AnimalService{

    @Override
    public String getAnimal() {
        return "I'm ant :)";
    }

    @Override
    public String walk() {
        return "I walk by 6 legs :)";
    }


}

package jack.animal.main;

import jack.animal.provider.ant.AntProvider;
import jack.animal.service.AnimalService;
import jack.animal.service.registration.AnimalServices;

public class main {

    public static void main(String[] args) {
        // In here we can change the implement from Ant to elephant with just 1 line of code.
    	// Save time and prvent bug when requirement change.
    	// AnimalServices.registerProvider("elephant", new ElephantProvider()); // Use this for Elephant implement
        AnimalServices.registerDefaultProvider(new AntProvider()); // Use tthis for Ant implement
        
        // This is common method we can keep this unchange.
        AnimalService animalService = AnimalServices.newInstance();
        
        System.out.println("what your name? \n " + animalService.getAnimal() + " and " + animalService.walk());
    }

}

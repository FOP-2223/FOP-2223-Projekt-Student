package projekt.gui.runner;

import javafx.stage.Stage;
import projekt.delivery.archetype.ProblemGroup;
import projekt.delivery.rating.RatingCriteria;
import projekt.delivery.runner.AbstractRunner;
import projekt.delivery.runner.Runner;
import projekt.delivery.service.DeliveryService;
import projekt.delivery.simulation.Simulation;
import projekt.delivery.simulation.SimulationConfig;

import java.util.Map;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A {@link Runner} that executes a {@link Simulation} and visualises it and its result with a gui.
 */
public class GUIRunner extends AbstractRunner {

    private final Stage stage;
    private volatile boolean terminationRequested = false;

    public GUIRunner(Stage stage) {
        this.stage = stage;
    }

    @Override
    public Map<RatingCriteria, Double> run(ProblemGroup problemGroup,
                                           SimulationConfig simulationConfig,
                                           int simulationRuns,
                                           DeliveryService.Factory deliveryServiceFactory) {

        //TODO H11.1
        /*
        combine your code from task H10.2 with the commented out code.
        The necessary variables are:
        simulation: the currently executed simulation
        problem: the currently simulated problemArchetype
        i: how often the simulation has been simulated already (the loop counter)
        results: the return value of this method
         */

        /* TODO add the following code directly before calling the runSimulation method
        //store the SimulationScene
        AtomicReference<SimulationScene> simulationScene = new AtomicReference<>();
        //CountDownLatch to check if the SimulationScene got created
        CountDownLatch countDownLatch = new CountDownLatch(1);
        //execute the scene switching on the javafx application thread
        int finalI = i;
        Platform.runLater(() -> {
            //switch to the SimulationScene and set everything up
            SimulationScene scene = (SimulationScene) SceneSwitcher.loadScene(SceneSwitcher.SceneType.SIMULATION, stage);
            scene.init(simulation, problem, finalI, simulationRuns, this);
            simulation.addListener(scene);
            simulationScene.set(scene);
            countDownLatch.countDown();
        });

        try {
            //wait for the SimulationScene to be set
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */


        //TODO run the simulation


        /* TODO add the following code directly after calling the runSimulation method
        //remove the scene from the list of listeners
        simulation.removeListener(simulationScene.get());

        //check if gui got closed
        if (terminationRequested) {
            return null;
        }
         */

        /* TODO add the following code at the very end of the method (after all simulations have been executed)
        //execute the scene switching on the javafx thread
        Platform.runLater(()->{
            RaterScene raterScene=(RaterScene)SceneSwitcher.loadScene(SceneSwitcher.SceneType.RATING,stage);
            raterScene.init(problemGroup.problems(),results);
            });
         */

        return crash(); // TODO: H11.1 - remove if implemented
    }


    public void terminate() {
        terminationRequested = true;
    }
}

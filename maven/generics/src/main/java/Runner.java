package main.java;

import main.java.implementation.IntExecutor;
import main.java.implementation.IntTask;
import main.java.implementation.IntValidator;
import main.java.interfaces.Executor;
import main.java.interfaces.Task;
import main.java.interfaces.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public class Runner {
    public static void test(List<Task<Integer>> intTasks) {
        Executor testExecutor = new IntExecutor();

        Validator intValidator = new IntValidator();

        for (Task<Integer> intTask : intTasks) {
            testExecutor.addTask(intTask);
        }

        testExecutor.addTask(new IntTask(23), intValidator);
        testExecutor.addTask(new IntTask(10), intValidator);
        testExecutor.addTask(new IntTask(17), intValidator);
        testExecutor.addTask(new IntTask(16), intValidator);

        testExecutor.execute();

        System.out.println("Valid results:");
        for (Object o : testExecutor.getValidResults()) {
            System.out.println(o);
        }
        System.out.println("Invalid results:");
        for (Object o : testExecutor.getInvalidResults()) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Task<Integer>> intTasks = new ArrayList<>();
        intTasks.add(new IntTask(100));
        test(intTasks);
    }
}

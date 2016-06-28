package test.java;

import main.java.implementation.IntExecutor;
import main.java.implementation.IntTask;
import main.java.implementation.IntValidator;
import main.java.interfaces.Executor;
import main.java.interfaces.Task;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Сергей on 10.06.2016.
 */
public class IntExecutorTest {
    Executor<Integer> intExecutor = new IntExecutor();


    @Test
    public void testGetValidResults() throws Exception {
        intExecutor.addTask(new IntTask(10), new IntValidator());
        intExecutor.addTask(new IntTask(5), new IntValidator());
        intExecutor.addTask(new IntTask(100), new IntValidator());
        intExecutor.addTask(new IntTask(-2), new IntValidator());
    }

    @Test
    public void testName2() throws Exception {
        List<Task<Integer>> taskList = new LinkedList();
        taskList.add(new IntTask(10));
        taskList.add(new IntTask(20));
        taskList.add(new IntTask(4));
    }

}
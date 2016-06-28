package main.java.implementation;


import main.java.interfaces.Task;

/**
 * Created by Mykhailenko Svitlana on 05.06.2016.
 */
public class IntTask implements Task<Integer> {
    private Integer result;

    public IntTask(int i) {
        this.result = i;
    }


    @Override
    public void execute() {
        result = result * 2;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}

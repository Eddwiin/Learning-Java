package NeuralNetwork;

import java.util.ArrayList;
import java.util.List;

public class Neuron extends ArrayList<Neuron> {
    public float value;
    public List<Neuron> in, out;

    public List<Neuron> getEnumerator() {
        return this;
    }
}

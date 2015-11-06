package tb.text;

public interface Composite<E extends Component> extends Component {
    void add(E component);

    void remove(E component);

}

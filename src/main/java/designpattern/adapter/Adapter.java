package designpattern.adapter;

import java.util.Map;

/**
 * Created by yangch on 2016/10/17.
 */
public class Adapter implements IPig {

    private Dog dog;
    private Cat cat;
    private Map<String, String> dogName;
    private Map<String, String> catName;

    public Adapter(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;

        dogName = dog.getDogName();
        catName = cat.getCatName();
    }

    @Override
    public String getName() {
        return dogName.get("name") + "," + catName.get("name");
    }
}

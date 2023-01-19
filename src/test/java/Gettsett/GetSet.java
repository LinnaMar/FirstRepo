package Gettsett;


public class GetSet {
    private String name = "Джон";

    public String getName() {
        return name;    //ты вытащишь эту переменную из привата и можешь ее звать с др.класса (файлика), назвав напр. myObj
        // и обращаясь myObj.getName();
    }

    public void setName(String newName) {
        this.name = newName;   // в др.файле(классе) можно дать Джону др.имя  myObj.setName, а потом вітащить єто др.имя myObj.getName()
        // и имя (перемнная) изменится
    }
}

/*You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.*/
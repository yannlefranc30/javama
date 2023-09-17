class bleue {
    public void java() {
        System.out.println("YES FOR JAVA");
    }
}

//methode java
class song extends bleue {
    public void java() {
        System.out.println("YES FOR JAVA");
    }
}

//methode java
class couleur extends bleue {
    public void java() {
        System.out.println("YES FOR JAVA");
    }
}

class Main {
    public static void main(String[] args) {
        bleue myAnimal = new bleue();  // Creation objet
        bleue mysong = new song();
        bleue mycouleur = new couleur();
        myAnimal.java();
        mysong.java();
        mycouleur.java();
    }
}
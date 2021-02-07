package PetClass;

public class Main {
    public static class Pet {
        private String _name, _location, _type;
        private Double _age;

        public Pet() {}

        public Pet(String name, String location, String type, Double age) {
            this._name = name;
            this._location = location;
            this._type = type;
            this._age = age;
        }

        public String getPetName() {
            return this._name;
        }

        public Double getPetAge() {
            return this._age;
        }
        public String getPetType() {
            return this._type;
        }

        public void setPetName(String name) {
            this._name = name;
        }
        public void setPetAge(Double age) {
            this._age = age;
        }
        public void setPetLocation(String location) {
            this._location = location;
        }
    }

    public static void main(String[] args) {

        Pet pet = new Pet(); //This creates a variable named pet that uses the default constructor, which doesn't do anything
        Pet pet2 = new Pet("", "", "", 0.0); //This creates a variable named pet2 using the constructor with parameters to clear all attributes		
    }

}
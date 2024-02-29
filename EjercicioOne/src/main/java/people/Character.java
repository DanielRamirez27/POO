
package people;


public class Character {
        String name;
        int age;
        char gender;
        String phrase;

        public Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase = phrase;
        }
        
        public Character(){
            
        }

        public void  saySomething() {
            System.out.println(this.phrase);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
        
        
}

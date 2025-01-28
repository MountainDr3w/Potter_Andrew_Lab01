import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp(){
        p1 = new Person("A", "A","A","A",1);
        p2 = new Person("B", "B","B","B",2);
        p3 = new Person("C", "C","C","C",3);
        p4 = new Person("D", "D","D","D",4);
        p5 = new Person("E", "E","E","E",5);
        p6 = new Person("F", "F","F","F",6);
    }

    @org.junit.jupiter.api.Test
    void Person() {
        Person A = new Person("A","A","A","A",1000);
        assertEquals("A",A.getFirstName());

    }

    @org.junit.jupiter.api.Test
    void setIDNum() {
        p1.setIDNum("0001");
        assertEquals("0001",p1.getIDNum());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p2.setFirstName("Bilbo");
        assertEquals("Bilbo",p2.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p3.setLastName("Baggins");
        assertEquals("Baggins",p3.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p4.setTitle("Esquire");
        assertEquals("Esquire",p4.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p5.setYOB(1999);
        assertEquals(1999,p5.getYOB());
    }

    @org.junit.jupiter.api.Test
    void fullName() { assertEquals("F F", p6.fullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() { assertEquals("F F F", p6.formalName());
    }

    @org.junit.jupiter.api.Test
    void toCSV() { assertEquals("F , F , F , F , 6",p6.toCSV());
    }
}
package myapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyAppTest {
  /*
  @BeforeAll
  static void beforeAll() {
    System.out.println("Start MyAppTest");
  }
  */

  /*
  @AfterAll
  static void afterAll() {
    System.out.println("Finish MyAppTest");
  }
  */

  @Test
  void testAMethod() {
    System.out.println("Run testAMethod");
    assertEquals(0, 0, "Validate 0 = 0")
  }
}

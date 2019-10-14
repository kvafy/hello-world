package org.kvafy.helloworld;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OracleTest {

  @Test
  public void getAnswer_expectedOutput() throws Exception {
    assertThat(new Oracle().getAnswer("arbitrary question")).isEqualTo("42");
  }
}

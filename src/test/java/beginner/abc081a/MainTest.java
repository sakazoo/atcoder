package beginner.abc081a;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MainTest {

  @Test
  public void ゼロ個() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "000";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("0" + System.lineSeparator()));
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  @Test
  public void 一個() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "100";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("1" + System.lineSeparator()));
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }


  @Test
  public void 二個() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "110";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("2" + System.lineSeparator()));
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  @Test
  public void 三個() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "111";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("3" + System.lineSeparator()));
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}

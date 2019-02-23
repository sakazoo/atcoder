package beginner.product;

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
  public void 偶数と偶数() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "2 2";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("Even" + System.lineSeparator()));
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
  public void 偶数と奇数() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "2 1";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("Even" + System.lineSeparator()));
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
  public void 奇数と奇数() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "1 1";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("Odd" + System.lineSeparator()));
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
  public void ゼロとの積() {
    InputStream in = null;
    ByteArrayOutputStream out = null;
    try {
      String input = "0 2";
      in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);
      out = new ByteArrayOutputStream();
      System.setOut(new PrintStream(out));

      Main.main(null);

      assertThat(out.toString(), is("Even" + System.lineSeparator()));
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

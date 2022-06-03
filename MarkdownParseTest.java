import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;

//weird change 


public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testfile1() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        Path fileName = Path.of(
            "test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(expected, links);
    }

    @Test
    public void testfile2() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        Path fileName = Path.of(
            "test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(expected, links);
    }

    @Test
    public void testfile3() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile4() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile5() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile6() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile7() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile8() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testSnipper1() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("`google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        String content = Files.readString(Path.of("snippet1.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testSnipper2() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        String content = Files.readString(Path.of("snippet2.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testSnipper3() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("https://www.twitter.com");
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        expected.add("https://cse.ucsd.edu/");
        String content = Files.readString(Path.of("snippet3.md"));
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }


}  
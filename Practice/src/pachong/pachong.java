package pachong;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author jiangqn
 * @Date 2018-01-30 13:51
 * @Description pachogn
 **/
public class pachong {
    public static final Logger logger = Logger.getLogger(pachong.class);
    public static String path = "D:\\GitHub\\java\\Practice\\src\\pachong";
    public static String matcherpath = "D:\\GitHub\\java\\Practice\\src\\pachong\\matcher.txt";
    public static String pachongpath;

    public static void getUrl(String url) {
        try {
            Document document = Jsoup.connect(url).get();
            pachongpath = path + "\\pachong.txt";
            File file = new File(pachongpath);
            logger.info("文件存在");
            if (!file.exists()) {
                file.createNewFile();
                logger.info("文件创建成功");
            }
            writefile(pachongpath, String.valueOf(document));
            String content = readfile(pachongpath);
            Pattern pattern = Pattern.compile("(<title>(.*?)</title>)");
            Matcher matcher = pattern.matcher(content);
            StringBuffer mcontent = new StringBuffer();
            while (matcher.find()){
                mcontent.append(matcher.group());
            }
            writematcher(matcherpath,mcontent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writefile(String filepath, String filecontent) throws IOException {
        PrintWriter pw = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        BufferedReader brd = null;
        try {
            File file = new File(filepath);
            fis = new FileInputStream(file);
            brd = new BufferedReader(new InputStreamReader(fis));
            if (brd.readLine() == null) {
                fos = new FileOutputStream(file);
                pw = new PrintWriter(fos);
                pw.write(filecontent);
                logger.info("写入成功");
                pw.flush();
            } else {
                logger.info("内容已存在");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (fis != null) {
                fis.close();
            }
            if (brd != null) {
                brd.close();
            }
        }

    }

    public static void writematcher(String filepath, String filecontent) throws IOException {
        PrintWriter pw = null;
        FileOutputStream fos = null;
        try {
            File file = new File(filepath);
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(filecontent);
            logger.info("写入成功");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }

        }
    }


    public static String readfile(String filepath) throws IOException {
        FileInputStream fis = null;
        BufferedReader brd = null;
        StringBuffer stb = null;
        try {
            File file = new File(filepath);
            fis = new FileInputStream(file);
            brd = new BufferedReader(new InputStreamReader(fis));
            String temp;
            stb = new StringBuffer();
            while ((temp = brd.readLine()) != null) {
                stb.append(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (fis != null) {
                fis.close();
            }
            if (brd != null) {
                brd.close();
            }
        }
        return stb.toString();
    }


    public static void main(String[] args){
        String url = "https://www.cnblogs.com/TTyb/p/5784581.html";
        getUrl(url);
    }
}

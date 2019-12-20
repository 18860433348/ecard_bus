package girl.friend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/10 11:32
**/
@ConfigurationProperties(prefix = "some.word")
public class GirlFriendAutoProperties {

    private String someHeartWord = "where are you ? My girl friend .";

    public String getSomeHeartWord() {
        return someHeartWord;
    }

    public void setSomeHeartWord(String someHeartWord) {
        this.someHeartWord = someHeartWord;
    }
}

package ThirteenLesson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class WikiDTO {
    @JsonProperty("batchcomplete")
    public String batchComplete;
    @JsonProperty("continue")
    public Continue cont;
    @JsonProperty("query")
    public Query query;

    public static class Continue {
        @JsonProperty("sroffset")
        public int srOffset;
        @JsonProperty("continue")
        public String cont;
    }

    public static class Searchinfo {
        @JsonProperty("totalhits")
        public int totalHits;
    }

    public static class Search {
        @JsonProperty("ns")
        public int ns;
        @JsonProperty("title")
        public String title;
        @JsonProperty("pageid")
        public int pageId;
        @JsonProperty("size")
        public int size;
        @JsonProperty("wordcount")
        public int wordCount;
        @JsonProperty("snippet")
        public String snippet;
        @JsonProperty("timestamp")
        public Date timestamp;
    }

    public static class Query {
        @JsonProperty("searchinfo")
        public Searchinfo searchinfo;
        @JsonProperty("search")
        public List<Search> search;
    }
}

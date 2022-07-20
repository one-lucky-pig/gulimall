package io.gulimall.search.service;

import io.gulimall.search.vo.SearchParam;
import io.gulimall.search.vo.SearchResult;

public interface SearchService {
    SearchResult getSearchResult(SearchParam searchParam);
}

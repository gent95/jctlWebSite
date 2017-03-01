package com.jctl.cloud.webapp.controller;

import com.jctl.cloud.common.persistence.Page;
import com.jctl.cloud.modules.website.entity.navbanner.NavBanner;
import com.jctl.cloud.modules.website.entity.navlist.NavList;
import com.jctl.cloud.modules.website.entity.newslist.NewsList;
import com.jctl.cloud.modules.website.service.navbanner.NavBannerService;
import com.jctl.cloud.modules.website.service.navlist.NavListService;
import com.jctl.cloud.modules.website.service.newslist.NewsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liukai on 2016/12/19 0019.
 */

@Controller()
@RequestMapping("wapNavList")
public class WapNavListController {

    @Autowired
    private NavListService navListService;
    @Autowired
    private NewsListService newsListService;
    @Autowired
    private NavBannerService navBannerService;


    /**
     *异步获取导航栏
     *
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public List<NavList> list() {
        try {
            List<NavList> navList = navListService.getNavList();
            if (navList == null) {
                return null;
            }
            navList = navData(navList);
            return navList;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public String list(Model model) {
        List<NavList> navList = navListService.getNavList();
        List<NavList> secondNavList = null;
        List<NavList> threeNavList = null;
        if (secondNavList.size() != 0) {
            for (NavList n : navList) {
                secondNavList = navListService.getByParentId(n.getParentId());
                if (secondNavList.size() != 0) {
                    for (NavList nv : secondNavList) {
                        threeNavList = navListService.getByParentId(nv.getParentId());
                    }
                }
            }
        }
        model.addAttribute("navParentList", navList);
        model.addAttribute("secondNavList", secondNavList);
        model.addAttribute("threeNavList", threeNavList);

        return "/modules/cms/front/themes/basic/layouts/default";
    }


    /**
     * 获取导航列表值
     *
     * @param navLists
     * @return
     */
    private List<NavList> navData(List<NavList> navLists) {
        if (navLists != null) {
            for (NavList nav : navLists) {
                List<NavList> child = navListService.getByParentId(nav.getId());
                if (child != null) {
                    navData(child);
                    nav.setChild(child);
                } else {
                    nav.setChild(new ArrayList<NavList>());
                }
            }
        }
        return navLists;
    }

    /**
     * 获取新闻列表页
     *
     * @param newsList
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping("newsList")
    public String newsList(NewsList newsList, HttpServletRequest request, HttpServletResponse response, Model model) {
        try {
            if (newsList.getNavId() != null) {
                Page<NewsList> page = newsListService.findPage(new Page<NewsList>(request, response), newsList);
                List<NewsList> newsLists = getResultList(page.getList(), newsList.getNavId());

                NavBanner search = new NavBanner();
                search.setNavId(newsList.getNavId());
                NavBanner banner =navBannerService.getByNavId(search);



                model.addAttribute("news", newsLists);
                model.addAttribute("banner", banner);
                model.addAttribute("page", page);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/web/news/newsList/newsList";
    }

    private List<NewsList> getResultList(List<NewsList> list, Long navId) {
        List<NewsList> result = new ArrayList<NewsList>();
        if (list != null && navId != null) {
            for (NewsList newsList : list) {
                if (newsList.getNavId() != null) {
                    if (newsList.getNavId().toString().equals(navId.toString())) {
                        result.add(newsList);
                    }
                }
            }
        }
        return result;
    }

}

package com.qf.controller;

import com.qf.pojo.Crowd;
import com.qf.pojo.Groundphoto;
import com.qf.pojo.Music;
import com.qf.pojo.Therapy;
import com.qf.service.CrowdService;
import com.qf.service.GroundphotoService;
import com.qf.service.MusicService;
import com.qf.service.TherapyService;
import com.qf.utils.MusicDataView;
import com.qf.utils.ShowDataView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShowController {

    @Resource
    private GroundphotoService groundphotoService;

    @Resource
    private MusicService musicService;

    @Resource
    private CrowdService crowdService;

    @Resource
    private TherapyService therapyService;

    //首页展示
    @RequestMapping(method = RequestMethod.GET,value = "/show/selectAll")
    public ShowDataView show(){

        Groundphoto groundphoto = groundphotoService.findall();
        List<Music> musicList = musicService.findallmusic();
        List<Crowd> crowdList = crowdService.findall();
        List<Therapy> therapyList = therapyService.findAll();

        Map datamap = new HashMap();

        datamap.put("groundphoto",groundphoto);
        datamap.put("hotList",musicList);
        datamap.put("crowdList",crowdList);
        datamap.put("theList",therapyList);


        ShowDataView showDataView = new ShowDataView();
        showDataView.setCode(0);
        showDataView.setMsg("成功");
        showDataView.setData(datamap);
        return showDataView;
    }

    //歌曲主键查询
    @RequestMapping(method = RequestMethod.GET,value = "/show/findByMid")
    public MusicDataView findByMid(@RequestParam(name = "mid") int mid){

        Music music = musicService.findbymid(mid);

        MusicDataView musicDataView = new MusicDataView();
        musicDataView.setCode(0);
        musicDataView.setMsg("成功");
        musicDataView.setData(music);

        return musicDataView;
    }
}

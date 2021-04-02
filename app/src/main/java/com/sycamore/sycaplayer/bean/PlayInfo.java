package com.sycamore.sycaplayer.bean;

import java.util.ArrayList;

/**
 * @author dingyx
 * @description: 播放地址
 * @date: 2021/4/2
 */
public class PlayInfo {

    private String name;
    private String url;

    public PlayInfo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private static ArrayList<PlayInfo> playInfoList;

    public static ArrayList<PlayInfo> getData() {

        if (playInfoList != null && playInfoList.size() > 0) {
            return playInfoList;
        }
        playInfoList = new ArrayList<>();
        playInfoList.add(new PlayInfo("CCTV-1综合", "rtmp://58.200.131.2:1935/livetv/cctv1"));
        playInfoList.add(new PlayInfo("CCTV-2财经", "rtmp://58.200.131.2:1935/livetv/cctv2"));
        playInfoList.add(new PlayInfo("CCTV-3综艺", "rtmp://58.200.131.2:1935/livetv/cctv3"));
        playInfoList.add(new PlayInfo("CCTV-4中文国际", "rtmp://58.200.131.2:1935/livetv/cctv4"));
        playInfoList.add(new PlayInfo("CCTV-5体育", "rtmp://58.200.131.2:1935/livetv/cctv5"));
        playInfoList.add(new PlayInfo("CCTV-6电影", "rtmp://58.200.131.2:1935/livetv/cctv6"));
        playInfoList.add(new PlayInfo("CCTV-7军事农业", "rtmp://58.200.131.2:1935/livetv/cctv7"));
        playInfoList.add(new PlayInfo("CCTV-8电视剧", "rtmp://58.200.131.2:1935/livetv/cctv8"));
        playInfoList.add(new PlayInfo("CCTV-9记录", "rtmp://58.200.131.2:1935/livetv/cctv9"));
        playInfoList.add(new PlayInfo("CCTV-10科教", "rtmp://58.200.131.2:1935/livetv/cctv10"));
        playInfoList.add(new PlayInfo("CCTV-11戏曲", "rtmp://58.200.131.2:1935/livetv/cctv11"));
        playInfoList.add(new PlayInfo("CCTV-12社会与法", "rtmp://58.200.131.2:1935/livetv/cctv12"));
        playInfoList.add(new PlayInfo("CCTV-13新闻", "rtmp://58.200.131.2:1935/livetv/cctv13"));
        playInfoList.add(new PlayInfo("CCTV-14少儿", "rtmp://58.200.131.2:1935/livetv/cctv14"));
        playInfoList.add(new PlayInfo("CCTV-15音乐", "rtmp://58.200.131.2:1935/livetv/cctv15"));


        playInfoList.add(new PlayInfo("湖南卫视", "rtmp://58.200.131.2:1935/livetv/hunantv"));
        playInfoList.add(new PlayInfo("东方卫视", "rtmp://58.200.131.2:1935/livetv/dftv"));
        playInfoList.add(new PlayInfo("安徽卫视", "rtmp://58.200.131.2:1935/livetv/ahtv"));
        playInfoList.add(new PlayInfo("兵团卫视", "rtmp://58.200.131.2:1935/livetv/bttv"));
        playInfoList.add(new PlayInfo("重庆卫视", "rtmp://58.200.131.2:1935/livetv/cqtv"));
        playInfoList.add(new PlayInfo("东南卫视", "rtmp://58.200.131.2:1935/livetv/dntv"));
        playInfoList.add(new PlayInfo("广东卫视", "rtmp://58.200.131.2:1935/livetv/gdtv"));
        playInfoList.add(new PlayInfo("广西卫视", "rtmp://58.200.131.2:1935/livetv/gxtv"));
        playInfoList.add(new PlayInfo("甘肃卫视", "rtmp://58.200.131.2:1935/livetv/gstv"));
        playInfoList.add(new PlayInfo("贵州卫视", "rtmp://58.200.131.2:1935/livetv/gztv"));
        playInfoList.add(new PlayInfo("湖北卫视", "rtmp://58.200.131.2:1935/livetv/hbtv"));
        playInfoList.add(new PlayInfo("河北卫视", "rtmp://58.200.131.2:1935/livetv/hebtv"));
        playInfoList.add(new PlayInfo("河南卫视", "rtmp://58.200.131.2:1935/livetv/hntv"));
        playInfoList.add(new PlayInfo("黑龙江卫视", "rtmp://58.200.131.2:1935/livetv/hljtv"));
        playInfoList.add(new PlayInfo("江苏卫视", "rtmp://58.200.131.2:1935/livetv/jstv"));
        playInfoList.add(new PlayInfo("江西卫视", "rtmp://58.200.131.2:1935/livetv/jxtv"));
        playInfoList.add(new PlayInfo("吉林卫视", "rtmp://58.200.131.2:1935/livetv/jltv"));
        playInfoList.add(new PlayInfo("辽宁卫视", "rtmp://58.200.131.2:1935/livetv/lntv"));
        playInfoList.add(new PlayInfo("内蒙古卫视", "rtmp://58.200.131.2:1935/livetv/nmtv"));
        playInfoList.add(new PlayInfo("宁夏卫视", "rtmp://58.200.131.2:1935/livetv/nxtv"));
        playInfoList.add(new PlayInfo("青海卫视", "rtmp://58.200.131.2:1935/livetv/qhtv"));
        playInfoList.add(new PlayInfo("四川卫视", "rtmp://58.200.131.2:1935/livetv/sctv"));
        playInfoList.add(new PlayInfo("山东卫视", "rtmp://58.200.131.2:1935/livetv/sdtv"));
        playInfoList.add(new PlayInfo("山西卫视", "rtmp://58.200.131.2:1935/livetv/sxrtv"));
        playInfoList.add(new PlayInfo("陕西卫视", "rtmp://58.200.131.2:1935/livetv/sxtv"));


        playInfoList.add(new PlayInfo("山东教育", "rtmp://58.200.131.2:1935/livetv/sdetv"));
        playInfoList.add(new PlayInfo("中国教育-1", "rtmp://58.200.131.2:1935/livetv/cetv1"));
        playInfoList.add(new PlayInfo("中国教育-3", "rtmp://58.200.131.2:1935/livetv/cetv3"));
        playInfoList.add(new PlayInfo("中国教育-4", "rtmp://58.200.131.2:1935/livetv/cetv4"));
        playInfoList.add(new PlayInfo("CCTV-第一剧场", "rtmp://58.200.131.2:1935/livetv/dyjctv"));
        playInfoList.add(new PlayInfo("CCTV-国防军事", "rtmp://58.200.131.2:1935/livetv/gfjstv"));
        playInfoList.add(new PlayInfo("CCTV-怀旧剧场", "rtmp://58.200.131.2:1935/livetv/hjjctv"));
        playInfoList.add(new PlayInfo("CCTV-风云剧场", "rtmp://58.200.131.2:1935/livetv/fyjctv"));
        playInfoList.add(new PlayInfo("CCTV-风云足球", "rtmp://58.200.131.2:1935/livetv/fyzqtv"));
        playInfoList.add(new PlayInfo("CCTV-风云音乐", "rtmp://58.200.131.2:1935/livetv/fyyytv"));

        playInfoList.add(new PlayInfo("CCTV-世界地理", "rtmp://58.200.131.2:1935/livetv/sjdltv"));
        playInfoList.add(new PlayInfo("CGTN-新闻", "rtmp://58.200.131.2:1935/livetv/cctv16"));
        playInfoList.add(new PlayInfo("CETV-1", "rtmp://58.200.131.2:1935/livetv/cetv1"));
        playInfoList.add(new PlayInfo("CETV-3", "rtmp://58.200.131.2:1935/livetv/cetv3"));
        playInfoList.add(new PlayInfo("CETV-4", "rtmp://58.200.131.2:1935/livetv/cetv4"));
        playInfoList.add(new PlayInfo("CHC高清电影", "rtmp://58.200.131.2:1935/livetv/chchd"));
        playInfoList.add(new PlayInfo("上海纪实高清", "rtmp://58.200.131.2:1935/livetv/docuchina"));
        playInfoList.add(new PlayInfo("金鹰纪实高清", "rtmp://58.200.131.2:1935/livetv/gedocu"));
        playInfoList.add(new PlayInfo("全纪实高清", "rtmp://58.200.131.2:1935/livetv/documentaryhd"));
        playInfoList.add(new PlayInfo("凤凰卫视中文台", "rtmp://58.200.131.2:1935/livetv/fhzw"));
        playInfoList.add(new PlayInfo("凤凰卫视资讯台", "rtmp://58.200.131.2:1935/livetv/fhzx"));
        playInfoList.add(new PlayInfo("凤凰卫视电影台", "rtmp://58.200.131.2:1935/livetv/fhdy"));
        playInfoList.add(new PlayInfo("星空卫视", "rtmp://58.200.131.2:1935/livetv/startv"));
        playInfoList.add(new PlayInfo("Star Sports", "rtmp://58.200.131.2:1935/livetv/starsports"));
        playInfoList.add(new PlayInfo("ChannelV", "rtmp://58.200.131.2:1935/livetv/channelv"));
        playInfoList.add(new PlayInfo("探索频道", "rtmp://58.200.131.2:1935/livetv/discovery"));
        playInfoList.add(new PlayInfo("国家地理频道", "rtmp://58.200.131.2:1935/livetv/natlgeo"));
        playInfoList.add(new PlayInfo("CHC家庭影院", "rtmp://58.200.131.2:1935/livetv/chctv"));
        playInfoList.add(new PlayInfo("CHC动作电影", "rtmp://58.200.131.2:1935/livetv/chcatv"));
        playInfoList.add(new PlayInfo("美国电视频道", "rtmp://media3.scctv.net/live/scctv_800"));
        playInfoList.add(new PlayInfo("香港财经", "rtmp://202.69.69.180:443/webcast/bshdlive-pc"));

        playInfoList.add(new PlayInfo("CCTV-1HD", "rtmp://58.200.131.2:1935/livetv/cctv1hd"));
        playInfoList.add(new PlayInfo("CCTV-2HD", "rtmp://58.200.131.2:1935/livetv/cctv2hd"));
        playInfoList.add(new PlayInfo("CCTV-3HD", "rtmp://58.200.131.2:1935/livetv/cctv3hd"));
        playInfoList.add(new PlayInfo("CCTV-4HD", "rtmp://58.200.131.2:1935/livetv/cctv4hd"));
        playInfoList.add(new PlayInfo("CCTV-5HD", "rtmp://58.200.131.2:1935/livetv/cctv5hd"));
        playInfoList.add(new PlayInfo("CCTV5+HD", "rtmp://58.200.131.2:1935/livetv/cctv5phd"));
        playInfoList.add(new PlayInfo("CCTV-6HD", "rtmp://58.200.131.2:1935/livetv/cctv6hd"));
        playInfoList.add(new PlayInfo("CCTV-7HD", "rtmp://58.200.131.2:1935/livetv/cctv7hd"));
        playInfoList.add(new PlayInfo("CCTV-8HD", "rtmp://58.200.131.2:1935/livetv/cctv8hd"));
        playInfoList.add(new PlayInfo("CCTV-9HD", "rtmp://58.200.131.2:1935/livetv/cctv9hd"));
        playInfoList.add(new PlayInfo("CCTV-10HD", "rtmp://58.200.131.2:1935/livetv/cctv10hd"));
        playInfoList.add(new PlayInfo("CCTV-12HD", "rtmp://58.200.131.2:1935/livetv/cctv12hd"));
        playInfoList.add(new PlayInfo("CCTV-14HD", "rtmp://58.200.131.2:1935/livetv/cctv14hd"));
        playInfoList.add(new PlayInfo("浙江卫视高清", "rtmp://58.200.131.2:1935/livetv/zjhd"));
        playInfoList.add(new PlayInfo("湖南卫视高清", "rtmp://58.200.131.2:1935/livetv/hunanhd"));
        playInfoList.add(new PlayInfo("安徽卫视高清", "rtmp://58.200.131.2:1935/livetv/ahhd"));
        playInfoList.add(new PlayInfo("重庆卫视高清", "rtmp://58.200.131.2:1935/livetv/cqhd"));
        playInfoList.add(new PlayInfo("东方卫视高清", "rtmp://58.200.131.2:1935/livetv/dfhd"));
        playInfoList.add(new PlayInfo("天津卫视高清", "rtmp://58.200.131.2:1935/livetv/tjhd"));
        playInfoList.add(new PlayInfo("东南卫视高清", "rtmp://58.200.131.2:1935/livetv/dnhd"));
        playInfoList.add(new PlayInfo("江西卫视高清", "rtmp://58.200.131.2:1935/livetv/jxhd"));
        playInfoList.add(new PlayInfo("河北卫视高清", "rtmp://58.200.131.2:1935/livetv/hebhd"));

        playInfoList.add(new PlayInfo("湖北卫视高清", "rtmp://58.200.131.2:1935/livetv/hbhd"));
        playInfoList.add(new PlayInfo("辽宁卫视高清", "rtmp://58.200.131.2:1935/livetv/lnhd"));
        playInfoList.add(new PlayInfo("四川卫视高清", "rtmp://58.200.131.2:1935/livetv/schd"));
        playInfoList.add(new PlayInfo("江苏卫视高清", "rtmp://58.200.131.2:1935/livetv/jshd"));
        playInfoList.add(new PlayInfo("山东卫视高清", "rtmp://58.200.131.2:1935/livetv/sdhd"));
        playInfoList.add(new PlayInfo("广东卫视高清", "rtmp://58.200.131.2:1935/livetv/gdhd"));
        playInfoList.add(new PlayInfo("深圳卫视高清", "rtmp://58.200.131.2:1935/livetv/szhd"));
        playInfoList.add(new PlayInfo("黑龙江卫视高清", "rtmp://58.200.131.2:1935/livetv/hljhd"));
        return playInfoList;


    }


    /**
     *
     * to add
     * 
     * 北京卫视高清:rtmp://58.200.131.2:1935/livetv/btv1hd
     * 北京文艺高清:rtmp://58.200.131.2:1935/livetv/btv2hd
     *
     * 北京影视高清:rtmp://58.200.131.2:1935/livetv/btv4hd
     *
     * 北京体育高清:rtmp://58.200.131.2:1935/livetv/btv6hd
     *
     * 北京新闻高清:rtmp://58.200.131.2:1935/livetv/btv9hd
     *
     * 北京纪实高清:rtmp://58.200.131.2:1935/livetv/btv11hd
     *
     * 北京卫视:rtmp://58.200.131.2:1935/livetv/btv1
     *
     * 北京文艺:rtmp://58.200.131.2:1935/livetv/btv2
     *
     * 北京科教:rtmp://58.200.131.2:1935/livetv/btv3
     *
     * 北京影视:rtmp://58.200.131.2:1935/livetv/btv4
     *
     * 北京财经:rtmp://58.200.131.2:1935/livetv/btv5
     *
     * 北京体育:rtmp://58.200.131.2:1935/livetv/btv6
     *
     * 北京生活:rtmp://58.200.131.2:1935/livetv/btv7
     *
     * 北京青年:rtmp://58.200.131.2:1935/livetv/btv8
     *
     * 北京新闻:rtmp://58.200.131.2:1935/livetv/btv9
     *
     * 北京卡酷:rtmp://58.200.131.2:1935/livetv/btv10
     *
     */
}

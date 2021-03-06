package cn.kinggm520.dao;

import cn.kinggm520.domain.DiaryType;
import cn.kinggm520.domain.User;

import java.util.List;

/**
 * 作者: kinggm Email:731586355@qq.com
 * 时间:  2020-03-02 23:07
 */
public interface DiaryTypeDao {

//    查询当前用户的所有日志类别和类别下日记数量
    public List<DiaryType> diaryTypeCountList(User user);


//    查询当前用户日志类别详情
    public  List<DiaryType> diaryTypeList(User user);

//    添加日记类别
    public int diaryTypeAdd(DiaryType diaryType,User user);

//    修改日志类别
    public int diaryTypeUpdate(DiaryType diaryType);


//    查询类别详细信息
    public DiaryType diaryTypeShow(String diaryTypeId);

    //    删除日记类别
        public int diaryTypeDelete(String diaryTypeId);

//判断当前日记类别下是否有日记
    public boolean existDiaryWithTypeId(String diaryTypeId,User user);

}

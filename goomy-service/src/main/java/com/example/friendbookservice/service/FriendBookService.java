package com.example.friendbookservice.service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.friendbookservice.dao.FriendsMapper;
import com.example.friendbookservice.dto.Friends;
import com.example.friendbookservice.dto.FriendsExample;

@Service
public class FriendBookService {

    @Autowired
    private FriendsMapper friendsMapper;

    public List<Friends> getAllFriends() {
        return friendsMapper.selectByExample(null);
    }

    public Friends getFriendById(Integer id) {
        return friendsMapper.selectByPrimaryKey(id);
    }

    public List<Friends> getFriendByUsername(String username) {
        FriendsExample example = new FriendsExample();
        example.createCriteria().andUsernameEqualTo(username);
        return friendsMapper.selectByExample(example);
    }

    public int addFriend(String username, String birthday) {
        Friends friend = new Friends();
        friend.setUsername(username);
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(birthday);
            friend.setBirthday(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format", e);
        }
        return friendsMapper.insert(friend);
    }

}

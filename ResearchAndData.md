I found this set of data that discusses [Popular Tiktok Videos, Authors, and Musics](https://www.kaggle.com/datasets/thedevastator/popular-tiktok-videos-authors-and-musics/data)

## The csvs available are titled: 
- tiktok_collected_liked_videos
- tiktok_collected_videos
- tiktok_funny_hashtag_videos
- trending_authors
- trending_videos

### All columns in the combined DataFrame:

['user_name', 'user_id', 'video_id', 'video_desc', 'video_time', 'video_length', 'video_link', 'n_likes', 'n_shares', 'n_comments', 'n_plays', 'author_id', 'author_uniqueId', 'author_nickname', 'author_avatarThumb', 'author_signature', 'author_verification', 'author_privateAccount', 'author_followingCount', 'author_followerCount', 'author_heartCount', 'author_videoCount', 'author_diggCount', 'author_heart', 'video_duration', 'video_cover', 'video_format', 'video_quality', 'video_definition', 'video_stats', 'video_shareCount', 'video_commentCount', 'video_playCount', 'video_originalItem', 'video_officialItem', 'video_secret', 'video_forFriend', 'video_stitchEnabled', 'video_shareEnabled', 'video_isAd', 'music_id', 'music_title', 'music_playUrl', 'music_coverThumb', 'music_authorName', 'music_originality', 'music_duration']

## Finding related hashtags:
I used a [popular hashtag generator](https://best-hashtags.com/hashtag/autism/) to find ASD related hashtags. 

#### Most Popular

```
#autism #autismawareness #autismacceptance #asd #adhd #specialneeds #autistic #autismmom #autismfamily #autismo #autismlove #memes #autismlife #autismspectrum #autismsupport #aspergers #disability #downsyndrome #autismspeaks #autismspectrumdisorder #autismparents #dankmemes #meme #love #mentalhealth #actuallyautistic #neurodiversity #anxiety #inclusion #specialeducation
```
#### Second Most Used
```
#autismdad #differentnotless #dank #autismcommunity #autismadvocate #sensoryprocessingdisorder #edgymemes #autismparent #aba #edgy #speechtherapy #education #autisme #cerebralpalsy #autismrocks #funny #cringe #parenting #autismjourney #neurodivergent #cancer #autismworld #therapy #disabilityawareness #depression #mentalhealthawareness #autismawarenessmonth #occupationaltherapy #lmao #dyslexia
```

I found that this set of data only had the following available: 

Popular ASD-Related Hashtags with Counts:
#funny: 108
#meme: 9
#memes: 4
#lmao: 3
#love: 2
#anxiety: 1

None of these are very specific or helpful, so this df will be placed on the backburner for now. 

# InstagramApiForJava
A complete Private Instagram API for Java and Kotlin.

## Features
Some of features:

|    |    |    |
| ------ | ------ | ------ |
| Login | Logout| Share media to direct thread 
| Edit profile | Change/remove profile picture | Get user tags by username |
| Get user timeline feed | Get all user media by username | Get media by its id |
| Get current user info | Get current user media | Get user info by its username 
| Get direct mailbox | Get recent recipients | Get ranked recipients |
| Like media | Unlike media | Follow user |
| Unfollow user | Set account private | Set account public |
| Delete comment | Get inbox thread | Send comment |
| Change password | Send direct message | Share story |
| Get location feed | Collection create/get by id/get all/add items | Send direct photo/video/ stories/profile/ link/location like/live |

## Version 2.0 Details:
- [Add] currentUser
- [Add] UnsendMessage in direct
- [Add] Load More TimeLine Posts
- [Add] Bundle To MediaOrAdd
- [Add] Bundle To Thread
- [Add] Get User Posts
- [Add] Get Me
- [Add] Get Thread By UserRecipient
- [Add] Bundle To Message
- [Add] ReelMentions to story
- [Add] StoryPolls to story
- [Add] ReelMentions To Story
- [Add] StoryFeedMedia To Story
- [Add] StoryHashtag To Story
- [Add] StoryLocation To Story
- [Add] StoryQuestion To Story
- [Add] StoryQuiz To Story
- [Add] StoryCountDown To Story
- [Add] StorySlider To Story
- [Add] StoryAntiBullySticker To Story
- [Add] Put Vote Slider To StoryProcessor
- [Add] MarkStoriesAsSeen To StoryProcessor
- [Add] StoryQuestionResponse To StoryProccesor
- [Add] StoryQuizAnswer To StoryProccesor
- [Change] threadId type in shareStory
- [Change] threadId type in shareMedia
- [Change] model of lastPermanentItem in IGThread
- [Bug Fixed] sendMediaImage in direct
- [Bug Fixed] sendVoice in direct


## Requirememt
#### RxJava RxAndroid
```
    implementation 'io.reactivex.rxjava2:rxjava:2.2.9'
    implementation 'io.reactivex.rxjava2:rxandroid:2.0.1'
```

#### Gradle
```
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
```

## Usage
#### Gradle
```
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
dependencies {
    implementation 'com.github.Sanardev:InstagramApiForJava:1.1.0'
}
```
#### Use instance of InstaClient:
```kotlin

instaClient = InstaClient(applicationContext, "username","password");
```
### Sample
Login Sample [link](https://github.com/BehzadArabi/Instagram-Api-Java-kotlin/blob/master/app/src/main/java/com/sanardev/instagramapijavatest/MainActivity.kt)

Two Step Auth Sample [link](https://github.com/BehzadArabi/Instagram-Api-Java-kotlin/blob/master/app/src/main/java/com/sanardev/instagramapijavatest/TwoStepAuthActivity.kt)

## License
MIT.

### Developer
| Name | Github | Email | Telegram |
| ------ | ------ | ------ | ------ |
| Behzad Arabi | [@Sanardev](https://github.com/sanardev) | [behzadab15@gmail.com](mailto:behzadab15@gmail.com) | https://t.me/theSanardev |

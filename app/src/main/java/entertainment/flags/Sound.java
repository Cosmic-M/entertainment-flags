package entertainment.flags;

public class Sound {
    private String mAssetPath;
    private Integer mSoundId;

    public Sound(String path){
        mAssetPath = path;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}

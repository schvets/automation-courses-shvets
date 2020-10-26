package infrastusture.data;

public interface UserDataMapper {
    User findUserByEmail(String email);
    User findUserByUserName(String email);
}

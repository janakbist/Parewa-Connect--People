package my.app.parewa.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAhm61r9I:APA91bG8dF9yGhHfcospEqilfeDsTgv3zT7h_NtN7GeigQDkmp6h63IbaZ5wjmMogXnRhb5xQx_yuvoitJSLsHGQUx-eI0AKgP5NFZi3wMSQ7h1J2jVN6eLZo8gcVuAhGxD5UY0pWNfx"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}

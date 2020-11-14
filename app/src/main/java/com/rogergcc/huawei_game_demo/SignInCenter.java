package com.rogergcc.huawei_game_demo;

import com.huawei.hms.support.hwid.result.AuthHuaweiId;

/**
 * Created by rogergcc on 31/10/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class SignInCenter {
    private static SignInCenter INS = new SignInCenter();

    private static AuthHuaweiId currentAuthHuaweiId;

    public static SignInCenter get() {
        return INS;
    }

    public void updateAuthHuaweiId(AuthHuaweiId AuthHuaweiId) {
        currentAuthHuaweiId = AuthHuaweiId;
    }

    public AuthHuaweiId getAuthHuaweiId() {
        return currentAuthHuaweiId;
    }
}
// src/Callback.js
import React, { useEffect } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

const Callback = () => {
  const { provider } = useParams();

  useEffect(() => {
    const getAccessToken = async () => {
      const urlParams = new URLSearchParams(window.location.search);
      const code = urlParams.get('code');

      if (code) {
        try {
          const response = await axios.get(
            `/auth/login/${provider}/callback?code=${code}`
          );
          console.log('Access Token:', response.data);
        } catch (error) {
          console.error('Error during token exchange', error);
        }
      }
    };

    getAccessToken();
  }, [provider]);

  return <div>Logging in with {provider}...</div>;
};

export default Callback;

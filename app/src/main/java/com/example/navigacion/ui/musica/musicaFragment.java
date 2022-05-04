package com.example.navigacion.ui.musica;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.navigacion.R;

public class musicaFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public musicaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SonidoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static musicaFragment newInstance(String param1, String param2) {
        musicaFragment fragment = new musicaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // **************************************************
    //Declarar variables para el reproductor de musica
    private View view;
    Button play_pau;
    MediaPlayer mp;
    ImageView iv;
    int posicion = 0;
    MediaPlayer vectormp [] = new MediaPlayer[5];

    Button btn_siguiente, btn_anterior;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_musica, container, false);

        play_pau = view.findViewById(R.id.play_pau);
        iv = view.findViewById(R.id.imageView);
        btn_siguiente = view.findViewById(R.id.btn_siguiente);
        btn_anterior= view.findViewById(R.id.btn_anterior);
        vectormp[0] = MediaPlayer.create(getContext(),R.raw.adiorama);
        vectormp[1] = MediaPlayer.create(getContext(),R.raw.anhelo);
        vectormp[2] = MediaPlayer.create(getContext(),R.raw.waitinginvain);
        vectormp[3] = MediaPlayer.create(getContext(),R.raw.winfreeworkitout);
        vectormp[4] = MediaPlayer.create(getContext(),R.raw.winfreenonegativity);

        play_pau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(vectormp[posicion].isPlaying())
                {
                    vectormp[posicion].pause();
                    play_pau.setBackgroundResource(R.drawable.play);
                    Toast.makeText(getContext(),"Pausa", Toast.LENGTH_SHORT).show();
                } else
                {
                    vectormp[posicion].start();
                    play_pau.setBackgroundResource(R.drawable.play);
                    Toast.makeText(getContext(),"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (posicion < vectormp.length -1)
                {
                    if (vectormp[posicion].isPlaying())
                    {
                        vectormp[posicion].stop();
                        posicion++;
                        vectormp[posicion].start();

                        if (posicion == 0)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if(posicion == 1)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 2)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 3)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 4)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }

                    } else
                    {
                        posicion++;

                        if (posicion == 0)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if(posicion == 1)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 2)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 3)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 4)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                    }
                } else
                {
                    Toast.makeText(getContext(), "No hay más canciones",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (posicion >=1 )
                {
                    if(vectormp[posicion].isPlaying())
                    {
                        vectormp[posicion].stop();
                        vectormp[0] = MediaPlayer.create(getContext(),R.raw.adiorama);
                        vectormp[1] = MediaPlayer.create(getContext(),R.raw.anhelo);
                        vectormp[2] = MediaPlayer.create(getContext(),R.raw.waitinginvain);
                        vectormp[3] = MediaPlayer.create(getContext(),R.raw.winfreeworkitout);
                        vectormp[4] = MediaPlayer.create(getContext(),R.raw.winfreenonegativity);
                        posicion--;

                        if (posicion == 0)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if(posicion == 1)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 2)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 3)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 4)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }

                        vectormp[posicion].start();

                    }else
                    {
                        posicion--;

                        if (posicion == 0)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if(posicion == 1)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 2)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 3)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                        else if (posicion == 4)
                        {
                            iv.setImageResource(R.drawable.banksy);
                        }
                    }

                } else
                {
                    Toast.makeText(getContext(), "No hay más canciones",Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }
}


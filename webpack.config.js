var webpack = require('webpack');

module.exports = {
    entry: "./app/assets/javascripts/commons.jsx",

    output: {
        path: "./public/javascripts",
        filename: "Bundle.js"
    },

    module: {
        loaders: [
            {
                test: /\.jsx$/,
                loader: 'babel',
                exclude: /node_modules/,
                query:
                {
                    presets: ['react', 'es2015', 'stage-0'],
                }
            }
        ]
    },
    plugins: [
        new webpack.ProvidePlugin({
            "React": "react",
        }),
    ]
};

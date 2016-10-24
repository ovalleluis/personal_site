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
                   presets:['es2015', 'react']
                }
            }
        ]
    }
};
